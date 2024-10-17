#include <stdio.h>

int main(){
	int m,n,p,q;
	int i,j,k;
	
	printf("Enter the number of rows and columns of the first matrix: ");
    	scanf("%d%d", &m, &n);
    	
	int a[m][n];
	
	printf("Enter the elements of the first matrix:\n");
	for (i = 0; i < m; i++) {
		for (j = 0; j < n; j++) {
			scanf("%d", &a[i][j]);
		}
	}
	
	printf("Enter the number of rows and columns of the second matrix: ");
	scanf("%d%d", &p, &q);
        
        int b[p][q];
        
        printf("Enter the elements of the first matrix:\n");
	for (i = 0; i < p; i++) {
		for (j = 0; j < q; j++) {
			scanf("%d", &b[i][j]);
		}
	}
	
	int result[m][q];
	for (i = 0; i < m; i++) {
		for (j = 0; j < q; j++) {
			result[i][j] = 0;
		}
	}
	
	for (i = 0; i < m; i++) {
		for (j = 0; j < q; j++) {
			for (k = 0; k < n; k++){
				result[i][j] += a[i][k] * b[k][j]
			}
		}
	}
    
}
