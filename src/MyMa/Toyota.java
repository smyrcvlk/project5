package MyMa;

import java.text.DecimalFormat;

public class Toyota  extends carLease implements carInterface {
    public Toyota(String name, String whichModel, int age, int salary, int totalCost, int downPayment, int termofLease, int leaseFee, double taxRate, double moneyFactor) {
        super(name, whichModel, age, salary, totalCost, downPayment, termofLease, leaseFee, taxRate, moneyFactor);
    }

    @Override
    public String leaseMonthlyCalculator() {
        double result= calculateDepreciation() + calculateInterest() + taxes();
        DecimalFormat df= new DecimalFormat("0.00");
        return df.format(result);
    }

    @Override
    public boolean isAligable() {
        if (salary>toyotaMinIncome) {
            return true;
        }
        else
            return false;
    }
    public String totalCalculator() {
        double result=(( Double.valueOf(leaseMonthlyCalculator()) * termofLease) + documentationFees);
        DecimalFormat df= new DecimalFormat("0.00");
        return df.format(result);
    }
    }


//        method name is totalCalculator
//
//        return type is String
//
//        calculation :  (leaseMonthlyCalculator * termofLease) + documentationFees
//
//        hint:  after the calculation result result will be 2.11222211 you need to change result as a 2.11
//
//     */



