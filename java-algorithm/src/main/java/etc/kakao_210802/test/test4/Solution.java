package etc.kakao_210802.test.test4;

class Solution {
    static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;

        for (i = 0; i < n; i++)
            lis[i] = 1;

        for (i = 1; i < n; i++)
            if (arr[i] >= arr[i-1] && lis[i] < lis[i-1] + 1) {
                lis[i] = lis[i-1] + 1;
            }

        for(i = 0; i < n; i++)
            lis[i] += lds(arr, n, i);

        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];

        return max;
    }

    static int lds(int arr[], int n, int index)
    {
        int lis[] = new int[n];
        int i, j, max = 0;

        for (i = 0; i < n; i++)
            lis[i] = 0;

        for (i = index+1; i < n; i++)
            if (arr[i] <= arr[i-1] && lis[i] < lis[i-1] + 1)
                lis[i] = lis[i-1] + 1;

        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];

        return max;
    }

    public static void main(String args[])
    {
        int arr[] = { 2, 1, 1, 2};
        int n = arr.length;
        System.out.println("Length of lis is " + lis(arr, n) + "\n");
    }
}
