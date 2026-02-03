//want to change a specific bit from 0 to 1 use OR
//num convrts into it's corresponding binary and the a particular given bit changed

#include <stdio.h>



//want to change a specific bit from 1 to 0 use || and ||
int clearbit(int num, int bitposition){
    num &= ~(1 << bitposition);
}




//setbit(|)   if 0 converts to 1
int setbit(int num, int bitposition){
    return (num | (1 << bitposition));
}



//gettbit(&)
int getbit(int num, int bitposition){
    return (num & (1 << bitposition));
}




int updatebit(int num, int bitposition,int value){
    int n = ~(1 << bitposition);
     n= num & n;

     return (n | (value << bitposition));

}




// toggling a particular bit position
int bit_toggling(int num,int bit_position){
    int masking = 1<<bit_position;
    printf("%d",masking);
    return (num ^ masking);
}




/*toggling right most set/1 bit*/
int bit_togglingRM1(int n){
    return n & (n-1);
    
}



int main(){
    int res1 = setbit(13,1);
    int res2 = getbit(13,2);
    int res3 = updatebit(13,2,1);
    int res4 = clearbit(13,1);
    int res5 = bit_toggling(13,2);
    int res6 = bit_togglingRM1(13);
       printf("Number after setting bit 13 = %d\n", res1);
       printf("Number after getting bit 13 = %d\n", res2);
       printf("Number after updating bit 13 = %d\n", res4);
       printf("Number after clearing bit 13 = %d\n", res3);
       printf("Number after toggling bit 13 = %d\n", res5);
       printf("Number after toggle_rm1 bit 13 = %d\n", res6);


    


       return 0;
}

// 
// int bit_toggling(int num,int bit_position){
//     int masking = 1<<bit_position;
//     return (num ^ masking);
// }


/*toggling right most set/1 bit
int bit_togglingRM1(int n){
    return n & (n-1);
    
}*/


// int main(){
//     int num = 5;
//     int k = 3;
//     int res = bit_toggling(num,k);
//     printf("after toggling: %d",res);

// return 0;

// }




// // int main(){
//     int num = 5;
    
//     int res = bit_togglingRM1(num);
//     printf("after toggling Right most 1: %d",res);

// return 0;

// }
