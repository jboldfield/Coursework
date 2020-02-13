#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int r;
    int i;
}complex;

int main(){
    complex m = {7, 8};
    complex n = m;
    char *p = malloc(7);
}