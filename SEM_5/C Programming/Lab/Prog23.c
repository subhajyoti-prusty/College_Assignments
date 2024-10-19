#include <stdio.h>

int main(){
	
	int n,i, sum = 0;
	
	printf("Enter the number of element in the array: \n");
	scanf("%d",&n);
	
	int arr[n];
	int *ptr[n];
	
	printf("Enter the elements of array:\n");
	for(i = 0; i < n; i++){
		scanf("%d",&arr[i]);
		ptr[i] = &arr[i];
	}
	
	for(i = 0; i< n; i++){
		sum += *ptr[i];
	}
	
	printf("Sum = %d",sum);
	
	return 0;
	
}
