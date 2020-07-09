package Chapter03;
// Пример трехмерного массива
public class ThreeArray {
    public static void main(String[] args) {
        int countArr = 3;
        int rowsArr = 3;
        int columnsArr = 10;
        int[][][] mmArr = new int[countArr][rowsArr][columnsArr];
        int c, i, j, k=0;
        for (c=0; c<countArr; c++)
            for (i=0; i<rowsArr; i++)
                for (j=0; j<columnsArr; j++) {
                    mmArr[c][i][j] = k;
                    k++;
                }
        for (c=0; c<countArr; c++) {
            for (i = 0; i < rowsArr; i++) {
                for (j = 0; j < columnsArr; j++)
                    System.out.print(mmArr[c][i][j] + "\t");
                System.out.println();
            }
            System.out.println();
        }
    }
}
/*
--------------------------------------
0	1	2	3	4	5	6	7	8	9
10	11	12	13	14	15	16	17	18	19
20	21	22	23	24	25	26	27	28	29

30	31	32	33	34	35	36	37	38	39
40	41	42	43	44	45	46	47	48	49
50	51	52	53	54	55	56	57	58	59

60	61	62	63	64	65	66	67	68	69
70	71	72	73	74	75	76	77	78	79
80	81	82	83	84	85	86	87	88	89
 */