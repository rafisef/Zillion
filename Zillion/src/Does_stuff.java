/**
 * Created by Rafael on 2/12/2016.
 * Lab 3
 */



class Zillion{
    private int[] x;
    public Zillion(int size){
        x = new int[size];
        for(int i=0;i<size;i++){
            x[i] = 0;
        }
    }
    public void increment(){
        int a = x.length-1;
        while (x[a] == 9){
            x[a] = 0;
            a--;
            if (a==0 && x[a]==9){
                //System.err.println("You're number has exceeded the size of the array");
                break;
            }
        }
        x[a] = (x[a]+1)%10;

    }
    public void print(){
        for(int i=0;i<x.length;i++) {
            System.out.print(x[i]);
        }
        System.out.println();

    }
}

 public class Does_stuff {
    public static void main(String[] args){
        Zillion counter = new Zillion(2);
        for(int i=0;i<150;i++) {
            counter.increment();
            counter.print();
        }
    }
}

/* Output
01
02
03
04
05
06
07
08
09
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
00
01
 */