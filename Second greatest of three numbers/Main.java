#include <stdio.h>

int main(void) 
{
    int a, b, c;
    int second_max;

    scanf( "%d%d%d", &a, &b, &c );

    if ( a < b )
    {
        if ( b < c ) second_max = b;
        else second_max = ( a < c ? c : a );
    }
    else
    {
        if ( a < c ) second_max = a;
        else second_max = ( b < c ? c : b );
    }

    printf( "second greatest = %d ", second_max );

    return 0;
}