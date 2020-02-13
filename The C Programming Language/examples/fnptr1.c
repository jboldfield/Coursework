// Source code modified from book example

/* Example demonstrates the need/use of a function pointer. */

#include<stdio.h>
#include<string.h>

int  PROFILES = 7;

char *likes[] = {
     "Bill: likes sports, TV, and dining",
     "Matt: likes arts, films, and theater",
     "Dave: likes books, arts, and films",
     "Peter: likes sports, cars, and hunting",
     "Josh: likes chess, books, and arts",
     "Mike: likes sports, dining, and cars",
     "Luis: likes films, dining, and sports"
   };

void find(){
  int i;
  puts("Finding who has interest in sports but not in hunting.");
  puts("Search result: ");
  puts("-------------------");

  for(i=0; i<PROFILES; i++){
    if(strstr(likes[i], "sports") && !strstr(likes[i], "hunting"))
      printf("%s\n", likes[i]);
  }
  puts("--------------------");
}

/*
void find(int (*match)(char *)){
	int i;
	puts("Search result:");
	puts("-------------------");
	for(i=0; i<PROFILES; i++){
		if(match(likes[i]))
			printf("%s\n", likes[i]);
		
	}
	puts("--------------------");
}


 int sports_but_no_hunting(char *st){
   return strstr(st, "sports") && !strstr(st, "hunting");
}


 int art_theater_dining(char *st){
	return strstr(st, "arts") || strstr(st, "theater") || strstr(st, "dining");
}

int books_and_films(char *st){
	return strstr(st, "books") && strstr(st, "films");
}
*/

int main(){

  find();
  
 // find(sports_but_no_hunting);
 // find(art_theater_dining);
 // find(books_and_films);

  return 0;
}
