#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>
void table(int n);
void quizz(int n);
void time_intensive(int b);
int random(int low, int high){
	 int i,num;
	 for(i=0;i<high;i++){
	 	num=(rand() % (high-low+1))+low;
	 	return num;
	 } 
	 
}
void time_limit(int n){
	int t,i;
	t=n;
	printf("Enter the time limit in Seconds to show the table \t Bet your Skils!!!\n");
	scanf("%d",&i);
    time_t initial_time = time(NULL);
    int time_limit = i;
    table(t);
    while ( (time(NULL) - initial_time) < time_limit )
    {
    	
    }
    system("cls");
}
int main(){
   int i,n,r;
   printf("\t\t----- TABLES LEARNING -----\n");
   printf("\nTell Me which table you should learn \t ");
   scanf("%d",&n);
   time_limit(n);
   printf("\t\t\t PRACTISE ");
   printf("\nHope you have Learnt %d tables",n);
   printf("\nLets learn stronger with some quizz");
   quizz(n);
   system("cls");
   printf("\t\t----- Appreciation-----\n");
   printf("\nWell done you have learnt %d table.",n);
   printf("\n \t\t Thank You  !! Will See You Next Time ");
   return 0;
   
}
void table(int n){
	int i,r;
	for(i=0;i<12;i++){
		r=i*n;
		printf("%d X %d = %d\n",i,n,r);
	}
}
void quizz(int n){
	int i,j,num,low=1,high=10,k=3;
	char chr[10];
	for(i=0;i<high;i++){
	num=random(low,high);
	printf("\nwhat is %d X %d=",n,num);
	scanf("%d",&j);
	int r=n*num;
	if(j==r){
		printf("\nHurrah you are right !!");
	}
	else if(j!=r){
		printf("\nNot right better next time");
		k--;
		printf("\n You have %d Chances",k);
		if(k==0){
			printf("\nBetter luck next time\n");
		    exit(0);	
		}
			else continue;
		  }
	}
	}
	
	 
