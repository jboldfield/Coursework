#include <stdio.h>  

//Object struct
typedef struct{
    int age;
    char type;
}object;

// A compare function that is used for searching an integer array 

int compareInt (void *x, void *y) 
{ 
    return *(int*)x == *(int*)y;
} 

int compareChar (void *x, void *y) 
{ 
  return *(char*)x == *(char*)y; 
}

int compareFloat (void *x, void *y) 
{ 
  return *(float*)x == *(float*)y; 
}

int compareObject (void *x, void *y){
    return (*(object *)x).age == (*(object *)y).age && (*(object *)x).type == (*(object *)y).type;
}

// General purpose search() function that can be used for searching 
// an element *x in an array arr[] of arr_size, where each element 
// has size indicated by elem_size

int search(int arr_size, int elem_size, void *x, void *arr, int (*compare)(void *, void *))
{ 
    char *ptr = (char *)arr;   
    int i;
    for (i=0; i<arr_size; i++){
        if ((compare)(ptr + i * elem_size, x))
           return i; 
    }

    // If element not found 
    return -1; 
} 

int main() // need to complete
{ 
    int arr[] = {2, 5, 7, 90, 70}; 
    int x = 7; // target
    void *pt = arr; // array pointer
    int (*compare)(void *, void *) = &compareInt; // function pointer
    printf("Int is found at %d\n", search(sizeof(arr)/sizeof(arr[0]), sizeof(arr[0]), &x, pt, compare));


    char str[] = {'A', 'B', 'C', 'D', 'E'};
    char x2 = 'B';  // target
    void *pt2 = str; // array pointer
    int (*compare2)(void *, void *) = &compareChar; // function pointer
    printf("Char is found at %d\n", search(sizeof(str)/sizeof(str[0]), sizeof(str[0]), &x2, pt2, compare2));

    float x3 = 7.9;
    float farr[] = {2.3, 3.5, 6.7, 6.8, 7.9};
    void *pt3 = farr; // array pointer
    int (*compare3)(void *, void *) = &compareFloat; // function pointer
    printf("Float is found at %d\n", search(sizeof(farr)/sizeof(farr[0]), sizeof(farr[0]), &x3, pt3, compare3));    

    object oarr[] = {{1, 'A'}, {2, 'B'}, {7, 'C'}, {9, 'D'}, {12, 'E'}};
    object x4 = {9, 'D'}; // target
    void *pt4 = oarr; // array pointer
    int (*compare4)(void *, void *) = &compareObject; // function pointer
    printf("Object is found at %d\n", search(sizeof(oarr)/sizeof(oarr[0]), sizeof(oarr[0]), &x4, pt4, compare4)); 

    return 0; 
} 