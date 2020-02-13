/*
 * Johnnie Oldfield
 * CS 3335
 * Fall 2018
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct{
    int add_road;
    char add_name1[25];
    char add_name2[25];
    int sqft;
    
    int price;
}prop;

// Function to get number of properties
int get_size(){
    // Data field
    int size = 0;
    FILE *ifp;

    // Open file
    ifp = fopen("properties.txt", "r");

    // Ignore starting strings
    fscanf(ifp, "%*s %*s %*s", NULL);

    // Go thorugh each property in file and add it to array
    while (fscanf(ifp, "%*d %*s %*s %*d %*d", NULL) != EOF){
        size++;
    }
    
    // Close file
    fclose(ifp);

    return size;
}

// Function that processes the input file
void process_file(prop *arrpt){
    //Data field
    FILE *ifp;

    //Open file
    ifp = fopen("properties.txt", "r");

    //Ignore starting strings
    fscanf(ifp, "%*s %*s %*s", NULL);

    //Go thorugh each property in file and add it to array
    prop temp;
    while (fscanf(ifp, "%d %s %s %d %d", &temp.add_road, &temp.add_name1, &temp.add_name2, &temp.sqft, &temp.price) != EOF){
        *arrpt = temp;
        arrpt++;
    }
    
    //Close file
    fclose(ifp);
}

// Function that prints a property struct
void print(prop p){
    printf("%d\t%s %s\t%d\t%d\n", p.add_road, p.add_name1, p.add_name2, p.sqft, p.price);
}

// Function for searching properties by rnage of square footage
void sqft_search(prop *arrpt, int size, int lower, int higher){
    // Data field
    int i;
    prop temp;

    printf("Properties within range %d-%d:\n", lower, higher);
    for(i = 0; i < size; i++){
        temp = *arrpt;
        if(temp.sqft >= lower && temp.sqft <= higher)
            print(temp);
        arrpt++;
    }
}

// Function for searching properties within budget 
void price_search(prop *arrpt, int size, int lower, int higher){
    // Data field
    int i;
    prop temp;

    printf("Properties within budget range %d-%d:\n", lower, higher);
    for(i = 0; i < size; i++){
        temp = *arrpt;
        if(temp.price >= lower && temp.price <= higher)
            print(temp);
        arrpt++;
    }
}

// Function for searching road name display average price and square footage
void add_search(prop *arrpt, int size, char name1[], char name2[]){
    // Data field
    int i, count = 0, sum_price = 0, sum_sqft = 0;
    float avg_price = 0, avg_sqft = 0;
    prop temp;

    // Get properties 
    printf("\nProperties with road name '%s %s':\n", name1, name2);
    for(i = 0; i < size; i++){
        temp = *arrpt;
        if(strcmp(name1, temp.add_name1) == 0 && strcmp(name2, temp.add_name2) == 0){
            count++;
            sum_price += temp.price;
            sum_sqft += temp.sqft;
            print(temp);
        }
        arrpt++;
    }

    // Set average
    avg_price = (float)sum_price / count;
    avg_sqft = (float)sum_sqft / count;
    printf("Average price: %.2f\nAverage square feet: %.2f", avg_price, avg_sqft);
}

// Function that brings user to a menu 
void menu(prop *stpt, prop *arrpt, int size){
    // Data field
    int choice = 5, lower = 0, higher = 0;
    char name1[25], name2[25];

    // Print menu
    printf("\n1) Search by range of square footage.\n");
    printf("2) Search by budget range.\n");
    printf("3) Search by name.\n");
    printf("0) To end.");

    while(choice != 0){
        // Reset array pointer
        arrpt = stpt;

        printf("\n\nEnter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 0:
                return;
            case 1:
                printf("\nEnter range of square feet (2000-2200): ");
                scanf("%d-%d", &lower, &higher);
                sqft_search(arrpt, size, lower, higher);
                break;
            case 2:
                printf("\nEnter budget range (200000-220000): ");
                scanf("%d-%d", &lower, &higher);
                price_search(arrpt, size, lower, higher);
                break;
            case 3:
                printf("\nEnter road name ('Ruby Way'): ");
                scanf("%s %s", &name1, &name2);
                add_search(arrpt, size, name1, name2);
                break;
            default:
                printf("Not a choice.");
                break;
        }
    }
}

int main(){
    // Data field
    int size;
    prop *stpt, *arrpt;

    // Get size for array 
    size = get_size();

    // Create an array of properties set start pointer
    // and array pointer 
    prop properties [size];
    stpt = properties;
    arrpt = stpt;

    // Pass pointer to get property information 
    process_file(arrpt);

    // Bring user to menu 
    menu(stpt, arrpt, size);

    return 0;
}