/* Source Author: Robert I. Pitts <rip@cs.bu.edu>
(Code has been modified for demonstration purpose) */

/* Demonstrates how data can be read from, and written to 
files. Closing of files after processing is important. */

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
  FILE *ifp, *ofp; // file pointers (handler)
  char *mode = "r"; // optional: you can put the mode directly when openning the file, however, this gives flexibility
  char outputFilename[] = "letter.txt"; // you can choose other file name
  char username[9];  /* One extra for nul char. */
  int score;

  ifp = fopen("grades.txt", mode);

  if (ifp == NULL) {
    fprintf(stderr, "Can't open input file!\n"); // Note the use of stderr; this may help in creating a log of all errors
    exit(1); //optional
  }

  ofp = fopen(outputFilename, "w");

  if (ofp == NULL) {
    fprintf(stderr, "Can't open output file %s!\n", outputFilename);
    
  }

  while (fscanf(ifp, "%s %d", username, &score) == 2) {
    fprintf(ofp, "%s %d\n", username, score+2); // simple processing just bumping the grades by 2 points
  }

  fclose(ifp); // closing of input file
  fclose(ofp); // closing of output file
  
  //fclose returns 0 if file is successfully closed, otherwise returns EOF, commonly -1

  return 0;
}