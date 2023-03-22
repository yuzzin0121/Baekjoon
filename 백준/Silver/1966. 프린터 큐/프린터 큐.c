#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int q[100];
int t;
int n, m;

int main()
{
	scanf("%d", &t);
	for (int i = 0; i < t; i++) {
		scanf("%d %d", &n, &m);
		int cnt = 1;
		int front = 0;
		int max = 0;
		// 우선 순위 입력받기
		for (int j = 0; j < n; j++) {
			scanf("%d", &q[j]);
		}

		while (1) {
			// 최댓값 찾기
			for (int k = 0; k < n; k++) {
				if (q[k] > max) 
					max = q[k];
			}
			// 최댓값을 찾을 때까지 front 이동
			while (q[front] != max) {
				front = (front + 1) % n;
			}
			if (front == m)
				break;
			q[front] = 0;
			front = (front + 1) % n;
			max = 0;
			cnt++;
		}
		printf("%d\n", cnt);
	}
}