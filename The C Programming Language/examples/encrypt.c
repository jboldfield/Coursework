#include "encode.h"

void encode(char *msg){
	
	while(*msg){
		*msg = *msg ^ 31;
		msg++;
	}
	
}