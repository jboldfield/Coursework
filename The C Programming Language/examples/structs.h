typedef struct{
   int score;
   char name[10];
}student;

typedef struct stacknode{
  student element;
  struct stacknode *next;
}stacknode;