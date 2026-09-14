class Solution2 {
    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            System.out.println();
        }
    }

    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // space
            System.out.println();
        }
    }

    public void pattern9(int n) {
        // top
        for (int i = 0; i < n; i++) { // space
            for (int j = 0; j < (n - 1 - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            // space
            System.out.println();
        }
        // Bottom
        for (int i = 0; i < n; i++) { // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // space
            System.out.println();
        }
    }

    public void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public void pattern12(int n) {
        int space = (2 * n - 1);
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                {
                    System.out.print(num++ + " ");
                }
            }
            System.out.println();
        }
    }

    public void pattern14(int n) {
        for (int i = 1; i <= n; i++) { // i = 2
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n - i + 1; j++) // (n-i+1)= 9(5-1+1)= 5 , 9(5-2+1)= 4...
            {
                System.out.print(ch);
                ch++; // moving to next char a -b-c-d-e...
            }
            System.out.println();
        }
    }

    public void pattern16(int n) {
        int ascii = 65;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) ascii);
            }
            ascii++;
            System.out.println();
        }
    }

    public void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            // characters
            char ch = 'A';
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < i) {
                    ch++;
                } else {
                    ch--;
                }
            }
            // space
            System.out.println();
        }
    }

    public void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void pattern19(int n) {
        for (int i = 1; i <= 2 * n; i++) { // for total no. of rows

            int stars = n - i + 1; // for the upper part
            int spaces = 2 * (i - 1);
            int stars2 = n - i + 1;

            if (i > n) {
                stars = i - n; // reverse : for the lower part
                spaces = 2 * (2 * n - i);
                stars2 = i - n;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
        }
    }

    public void pattern21(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public void pattern22(int n) {

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int min = Math.min(Math.min(top, bottom),
                        Math.min(left, right));

                System.out.print((n - min) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();

        int[] arr = { 5 };

        for (int n : arr) {
            s.pattern22(n);
            System.out.println();
        }
    }
}