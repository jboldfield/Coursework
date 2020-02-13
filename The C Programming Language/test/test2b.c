#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Struct for point
typedef struct point{
    int x;
    int y;
}point;

int main(){
    FILE *ifp, *ofp;
    int x, y, i, j, pos;
    struct point arr[10];
    double min;
    double dis;

    // Get file input 
    ifp = fopen("points.txt", "r");

    i = 0;
    while (fscanf(ifp, "%d %d\n", &x, &y) != EOF){
        point p = {x, y};
        arr[i] = p;
        i++;
    }

    fclose(ifp);

    // Find minimum distance
    min = sqrt(pow(arr[i].x - arr[i + 1].x, 2) + pow(arr[i].y - arr[i + 1].y, 2));
    for(i = 0; i < 8; i++){
        dis = sqrt(pow(arr[i].x - arr[i + 1].x, 2) + pow(arr[i].y - arr[i + 1].y, 2));
        if (dis < min){
            min = dis;
            pos = i;
        }
        pos++;
    }

    printf("Minimum distance = %d\nPoints = (%d, %d), (%d, %d)", min, arr[pos].x, arr[pos].y, arr[pos + 1].x, arr[pos + 1].y);


    return 0;
}