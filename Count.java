import java.util.*;
import java.io.*;
import ou.*;
/**
 * Write a description of class Count here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Count
{
   // instance variables - replace the example below with your own
   private int H;
   private int D;
   private int W;
   private int M;
   private int Y;
   /**
    * Constructor for objects of class Count
    */
   public Count()
   {
      this.H = 0;
      this.D = 0;
      this.W = 0;
      this.M = 0;
      this.Y = 0;
   }
   
   /**
    * Asks users for inputs for hours, days, weeks, months and years.
    * Then recompiles as the largest value.
    * Then returns the values.
    */
   
   public String inputTime()
   {
      this.reset();
      if(OUDialog.confirm("Would you like to input some hours?"))
      {
         setH(Integer.parseInt(OUDialog.request("How many hours would you like to put in?")));
      }
      
      if(OUDialog.confirm("Would you like to input some days?"))
      {
         setD(Integer.parseInt(OUDialog.request("How many days would you like to put in?")));
      }
      
      if(OUDialog.confirm("Would you like to input some weeks?"))
      {
         setW(Integer.parseInt(OUDialog.request("How many weeks would you like to put in?")));
      }
     
      if(OUDialog.confirm("finally, would you like to input some years?"))
      {
         setY(Integer.parseInt(OUDialog.request("How many years would you like to put in?")));
      }
      
      if(this.H == 0 && this.D == 0 && this.W == 0 && this.Y == 0)
      {
         OUDialog.alert("You've got to put something in!");
      }
      
      this.recompile();
      return this.finish();
   }
   
   
   /**
    * recompiles the values.
    * This assumes there are 30 days in a month
    */
   private void recompile()
   {
      this.W = this.getD() + (this.getM() * 30);
      while (this.getH() >= 24)
      {
         this.D = this.getD() + 1;
         this.H = this.getH() - 24;
      }
      while (this.getD() >= 365)
      {
         this.Y = this.getY() + 1;
         this.D = this.getD() - 365;
      }
      while (this.getD() >= 7)
      {
         this.W = this.getW() + 1;
         this.D = this.getD() - 7;
      }
      while (this.getW() >= 4)
      {
         this.M = this.getM() + 1;
         this.W = this.getW() - 4;
      }
   }
      
   /**
    * Get H.
    */
   public String finish()
   {
      return "You have entered " + this.getY() + " years, " + this.getM() + " months, " + this.getW() + " weeks, " + 
      this.getD() + " days and " + this.getH() + " hours!";
   }
   
   
   /**
    * resets all inputs to zero
    */
   
   private void reset()
   {
      this.H = 0;
      this.D = 0;
      this.W = 0;
      this.M = 0;
      this.Y = 0;
   }

   /**
    * Get H.
    */
   public int getH()
   {
      return this.H;
   }
   
   /**
    * Set H.
    */
   public void setH(int hours)
   {
      this.H = hours;
   }
   
   /**
    * Get D.
    */
   public int getD()
   {
      return this.D;
   }
   
   /**
    * Set D.
    */
   public void setD(int days)
   {
      this.D = days;
   }
   
   /**
    * Get W.
    */
   public int getW()
   {
      return this.W;
   }
   
   /**
    * Set W.
    */
   public void setW(int weeks)
   {
      this.W = weeks;
   }
   
   /**
    * Get M.
    */
   public int getM()
   {
      return this.M;
   }
   
   /**
    * Set M.
    */
   public void setM(int months)
   {
      this.M = months;
   }
   
   /**
    * Get Y.
    */
   public int getY()
   {
      return this.Y;
   }
   
   /**
    * Set Y.
    */
   public void setY(int years)
   {
      this.Y = years;
   }
}
   