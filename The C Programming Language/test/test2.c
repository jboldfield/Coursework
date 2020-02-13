#include <stdio.h>
#include <stdlib.h>

int main (){
    enum options{AGREE, NEUTRAL, DISAGREE};

    struct question{
        char text[80];
        int points;
        enum options opt;
    }question;

    int choice;
    
    printf("Enter question: ");
    fgets(question.text, 80, stdin);
    printf("Enter correct option for question(Agree = 0, Nuetral = 1, Disagree = 2): ");
    scanf("\n%d", &choice);

    if(choice == 0){
		question.opt = AGREE;
    }
	if(choice == 1){
		question.opt = NEUTRAL;
    }
	if(choice == 2){
		question.opt = DISAGREE;
    }

    if(question.opt == AGREE){
		question.points = 1;
        printf("\nQuestion:\tAwnser:\t%sAGREE\nScore:\t%d", question.text, question.points);
    }
	if(question.opt == NEUTRAL){
		question.points = 0;
        printf("\nQuestion:\t%sAwnser:\tNEUTRAL\nScore:\t%d", question.text, question.points);
    }
	if(question.opt == DISAGREE){
		question.points = -1;
        printf("\nQuestion:\t%sAwnser:\tDISAGREE\nScore:\t%d", question.text, question.points);
    }

    return 0;
}