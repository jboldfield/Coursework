#include<stdio.h>
#include<stdlib.h>

struct node 
{ 
    int key; 
    struct node *left;
    struct node *right; 
}; 
   
// function to create a new BST node 
struct node *newNode(int item) 
{ 
    struct node *temp =  (struct node *)malloc(sizeof(struct node)); 
    temp->key = item; 
    temp->left = temp->right = NULL; 
    return temp; 
} 
   
// function to do inorder traversal of BST 
void inorder(struct node *root) 
{ 
    if (root != NULL) 
    { 
        inorder(root->left); 
        printf("%d \n", root->key); 
        inorder(root->right); 
    } 
} 

struct node* search(struct node* root, int key) 
{ 
    // Base Cases: root is null or key is present at root 
    if (root == NULL || root->key == key) 
       return root; 
     
    // Key is greater than root's key 
    if (root->key < key) 
       return search(root->right, key); 
  
    // Key is smaller than root's key 
    return search(root->left, key);
} 

void search(struct node* root, int key){
	
	struct node *item = search(root, key);
    if(item != NULL)
    	printf("The key %d is found in the BST.\n", key);
    else
    	printf("The key %d is not found in the BST.\n", key);
	
}

/* function to insert a new node with given key in BST */
struct node* insert(struct node* node, int key) 
{ 
    /* If the tree is empty, return a new node */
    if (node == NULL) return newNode(key); 
  
    /* Otherwise, go left, or right recursively */
    if (key < node->key) 
        node->left  = insert(node->left, key); 
    else if (key > node->key) 
        node->right = insert(node->right, key);    
  
    /* return the node pointer */
    return node; 
} 

int main() 
{ 
    
    struct node *root = NULL; 
    root = insert(root, 56); 
    insert(root, 38); 
    insert(root, 23);
    insert(root, 47); 
    insert(root, 77); 
    insert(root, 68); 
    insert(root, 89); 
   
   inorder(root); 
   
   search(root, 77);
   search(root, 63); 
   
    return 0; 
} 
