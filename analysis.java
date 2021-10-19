import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikhi
 */
public class  analysis extends JFrame {
    static long insertionsort;
    static long selectionsort;
    static long bubblesort;
    static long quicksort;
    static long mergesort;
    JTextArea t1;
    JScrollPane scroll;
    Map<Long,String> m = new HashMap<>();
    ArrayList<Long> l = new ArrayList<>();
    
    public analysis(long insertionsort,long selectionsort,long bubblesort,long quicksort,long mergesort){
        this.insertionsort = insertionsort;
       m.put(insertionsort,"InsertionSort");
       l.add(insertionsort);
        this.selectionsort = selectionsort;
        m.put(selectionsort, "Selectionsort");
        l.add(selectionsort);
      this.bubblesort = bubblesort;
      m.put(bubblesort, "BubbleSort");
      l.add(bubblesort);
   
        this.quicksort = quicksort;
 m.put(quicksort,"QuickSort");
 l.add(quicksort);
        
        this.mergesort = mergesort;
        m.put(mergesort,"MergeSort");
        l.add(mergesort);
            
       Collections.sort(l);
       t1 = new JTextArea(30,100);
       
        Font f1 = new Font("arial",Font.PLAIN,14);
        setLayout(new FlowLayout());
      
       t1.setFont(f1);
       t1.setBounds(0, 0, 1000, 1000);
       
       t1.setWrapStyleWord(true);
       t1.setLineWrap(true);
       t1.append("INSERTION SORT");
       t1.append("\n");
       t1.setText("Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.\n" +
"Algorithm \n" +
"To sort an array of size n in ascending order: \n" +
"1: Iterate from arr[1] to arr[n] over the array. \n" +
"2: Compare the current element (key) to its predecessor. \n" +
"3: If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.\n" +
"\n" +
"Time Complexity :\n" +
"Average Time Complexity :  O(n²)\n" +
"Worst Case Complexity : O(n²)\n" +
"Best Case Complexity: O(n)\n" +
"\n" +"SpaceComplexity : O(1)"+
"Time Taken by our Project :"+insertionsort);
       t1.append("\n");
       t1.append("Quicksort is an in-place sorting algorithm. Developed by British computer scientist Tony Hoare in 1959[1] and published in 1961, it is still a commonly used algorithm for sorting. When implemented well, it can be somewhat faster than merge sort and about two or three times faster than heapsort.\n" +
"\n" +
"Quicksort is a divide-and-conquer algorithm. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. For this reason, it is sometimes called partition-exchange sort.The sub-arrays are then sorted recursively. This can be done in-place, requiring small additional amounts of memory to perform the sorting.  \n" +
"\n" +
"Time Complexity:\n" +
"\n" +
"Worst-case analysis :O(n²) (Happens When Pivot choosen is the largest or smallest).\n" +
"Best-case analysis :O(n log n)\n" +
"Average-case analysis:O(n log n) \n" +
"\n" +"Space Complexity : O(logn)"+
"Time taken by our project:"+quicksort);
       t1.append("\n");
       t1.append("The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.\n" +
"1) The subarray which is already sorted. \n" +
"2) Remaining subarray which is unsorted.\n" +
"In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. \n" +
"\n" +
"Time Complexity:\n" +
"\n" +
"Worst-case space complexity: O(n2) \n" +
"Best-case performance: О(n2) \n" +
"Worst-case performance: О(n2)\n" +
"\n" +
"Space Complexity:\n" +
"\n" +
"Constant Space: O(1) "+ "Time taken by out Project:"+selectionsort);
       t1.append("\n");
       t1.append("Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The algorithm, which is a comparison sort, is named for the way smaller or larger elements \"bubble\" to the top of the list.\n" +
"\n" +
"This simple algorithm performs poorly in real world use and is used primarily as an educational tool. More efficient algorithms such as quicksort, timsort, or merge sort are used by the sorting libraries built into popular programming languages such as Python and Java.\n" +
"\n" +
"Time Complexity:\n" +
"\n" +
"best-case time: O(n)\n" +
"worst-case time: O(n²)\n" +
"average time complexity: O(n²)\n" +
"\n" +
"Space Complexity: O(1)\n" +
"\n" +
"Time taken by our project: "+bubblesort);
       t1.append("\n");
       t1.append("In computer science, merge sort (also commonly spelled as mergesort) is an efficient, general-purpose, and comparison-based sorting algorithm. Most implementations produce a stable sort, which means that the order of equal elements is the same in the input and output. Merge sort is a divide and conquer algorithm that was invented by John von Neumann in 1945.A detailed description and analysis of bottom-up merge sort appeared in a report by Goldstine and von Neumann as early as 1948.\n" +
"\n" +
"Conceptually, a merge sort works as follows:\n" +
"Divide the unsorted list into n sublists, each containing one element (a list of one element is considered sorted).\n" +
"Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining. This will be the sorted list.\n" +
"\n" +
"Time Complexity:\n" +
"\n" +
"Best Case Time Complexity: O(n*log n)\n" +
"Worst Case Time Complexity: O(n*log n)\n" +
"Average Time Complexity: O(n*log n)\n" +
"\n" +
"Space Complexity\n" +
"Auxiliary Space: O(n)\n" +
"\n" +
"Time taken by our project:"+mergesort+"\n");
t1.append("It has been observed that for smaller number of records Algorithms without recursion have better performance because recursion becomes computationally expensive \n");
t1.append("For the File \n");  

t1.append(m.get(l.get(0))+" : "+l.get(0)+"\n");
t1.append(m.get(l.get(1))+" : "+l.get(1)+"\n");
t1.append(m.get(l.get(2))+" : "+l.get(2)+"\n");
t1.append(m.get(l.get(3))+" : "+l.get(3)+"\n");
t1.append(m.get(l.get(4))+" : "+l.get(4)+"\n");

       
       
       
       
       scroll = new JScrollPane (t1 
   );
        scroll.setSize(400,400);
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.getViewport().add(t1);
        
        add(scroll);
       
       
       
      
    }
    public static void main(String[] args){
    analysis gui = new analysis(insertionsort,selectionsort,bubblesort,
    quicksort,
   mergesort);
    gui.setVisible(true);
    }
    


   
}
© 2021 GitHub, Inc.
Terms
Privacy
S
