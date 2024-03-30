/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Rhisma Syahrul Putra
 */

class StopWatch {
    private long startTime;
    private long endTime;
    
//    Membuat Konstruktor tanpa argumen:
    public  StopWatch() {
        startTime = System.currentTimeMillis();
    }
    
//    Membuat Metode start dan Stop
    public void start() {
        startTime = System.currentTimeMillis();
    }
    
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    
//    Membuat metode getElapsedTime:
    public long getElapsedTime() {
        return endTime - startTime;
    }
}

public class Main {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int minIndeks = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndeks]) {
                    minIndeks = j;
                }
            }
            int temp = arr[minIndeks];
            arr[minIndeks] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int [100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        
//        Membuat objek stopwatch
        StopWatch stopwatch = new StopWatch();
        
//        memulai pengukuran waktu
        stopwatch.start();
        
//        melakukan pengurutan dengan sorting
        selectionSort(array);
        
//        Mengehentikan pengukuran waktu
        stopwatch.stop();
        
//        Mendapatkan waktu yang telah berlalu dalam milidetik
        long elapsedTime = stopwatch.getElapsedTime();
        
        System.out.println("Waktu eksekusi pengurutan 100.000 angka menggunakan selection sort: \n" + elapsedTime + " Milidetik");
    }
    
}
