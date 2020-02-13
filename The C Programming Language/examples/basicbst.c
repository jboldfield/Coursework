/* Code implementing a simple binary search tree (BST) that holds
distinct integers, and allow insert(), search(), and traversals. */

// You need to think recursively for most of the functions/actions

//Author:
// please rename the file with your lastnanme

#include<stdio.h>
#include<stdlib.h>

typedef struct bstnode{
   int val;
   struct bstnode *lch;
   struct bstnode *rch;
}bstnode;


bstnode *create_node(int key){ //complete the function
 // can you create a bstnode 'temp' and allocate space dynamically?
 
 temp->val = key;
 // code to initialize the other two fields of the node?
 
 return temp;
}

bstnode* insert_node(bstnode *node, int key){ //here *node indicates the pointer to the insertion point

   if(node == NULL) // when the BST is empty, we create a new node
      return craete_node(key);
   
   // code to handle the other cases?
   
   return node;
}

bstnode* search(bstnode* root, int key){ // complete the function


}

void search_result(bstnode* root, int key){ // this is done for you
   bstnode *item = search(root, key);
   if(item != NULL)
      printf("The key %d is found in the BST.\n", key);
   else
      printf("The key %d is not found in the BST.\n", key);
}

void inorder_display(bstnode *root){ //this is done for you
   if(root != NULL){
      inorder_display(root->lch);
      printf("%d \n", root->val);
      inorder_display(root->rch);
}

// [Extra credit] can you write a post-order display as well?

void postorder_display(bstnode *root){
//
//
//
}


int main(){
   bstnode *root = NULL;
   root = insert_node(root, 56); // setting the root
   
   insert_node(root, 33);
   // test with some more insert() call like the above
   
   inorder(root); //displaying the current state of the BST in inorder traversal
   
   search_result(root, 33); // Should return "found" in the tree
   //  test more searches
   
   //create a menu to allow user to do any of the following
   //to insert node by specifying the data
   //to display the tree inorder (if postorder is implemented, then another option for it
   //to enter a key to be searched
   
   return 0;   
}
   