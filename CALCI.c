#include<stdio.h>
void add(int a,int b) //for addition
{
    printf("%d",a+b);

}
void sub(int a,int b) //for subtraction
{
    printf("%d",a-b);
}
void mul(int a,int b) //for multiplication
{
    printf("%d",a*b);
}
void div(int a ,int b) //for division
{
    printf("%d",a/b);
}
int main()
{
    int x,y;
    printf("Enter two numbers:");
    scanf("%d %d",&x,&y);
    int choice,r=1;
    while(r==1)
    {
        printf("Enter your choice:\n");
        printf("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
            add(x,y);
            break;
            case 2:
            sub(x,y);
            break;
            case 3:
            mul(x,y);
            break;
            case 4:
            div(x,y);
            break;
            default:
            printf("Invalid choice");

        }
        printf("\nEnter 1 to continue 0 to end\n");
        scanf("%d",&r);
    }

}