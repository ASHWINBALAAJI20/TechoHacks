#include<stdio.h>
#include<string.h>
int main()
{
    char s[1001];
    printf("Enter a string");
    scanf("%s",s);
    int a=0;
    int b=strlen(s)-1;
    while(b>a)
    {
        if(s[a++]!=s[b--])
        {
            printf("%s is Not a Palindrome",s);
            return 0;
        }
    }
    printf("%s is a Palindrome");
    return 0;

}