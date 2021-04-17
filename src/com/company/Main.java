package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        getDataPart2();


    }

    public static void getDataPart1(){
        String[] names = new String[2];
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        while(true){

            String name = scanner.nextLine();

            try{

                if(name=="o"){
                    break;
                }
                names[index] = name;
                index++;


            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(ex.toString());
            }
            catch (Exception ex){
                System.out.println(ex.toString());
            }
        }
    }

    public static void getDataPart2() throws ArrayIndexOutOfBoundsException , Exception{

        String[] names = new String[2];
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        while(true){

            String name = scanner.nextLine();
            if(name=="o"){
                break;
            }
            names[index] = name;
            index++;



        }
    }


}
