/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velas;

/**
 *
 * @author demen
 */
public class soplar {
    public int velas = 0, velasOff = 0;
    public int[] altura = new int[100]; 
    public int mayor=altura[0];
    public void velas1(int b)
    {
            this.velas=b;
    }
     public int ObVelas() {
            return this.velas;
     }
     public void Altura1()  {
        
        for(int i=0;i<velas;i++)
        {
            altura[i]= (int) (Math.random()*velas+1);
        }
            
    }
     public int ObAltura1()    {
            return this.altura[100];
    }
    public void caltura2()   {
        System.out.print("\nLa altura de las velas es: ");           
        for(int i=0;i<velas;i++)
        {
            System.out.print( + altura[i] + " ");
        }
    }
    public void Offvelas()   {
        
        for(int i=0;i<velas;i++)
        {
            if (mayor<altura[i])                
                mayor=altura[i];                                      
        }
        for (int i=0; i<velas;i++)
        {
            if (mayor==altura[i])
                    velasOff+=1;           
        }
        System.out.println("\nEl número de velas que se apagaron: " + velasOff);
        
    }
}
