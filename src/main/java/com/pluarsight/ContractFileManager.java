package com.pluarsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager  {
    public static void saveContract(Contract contract) {
        Vehicle vehicle = contract.getVehicalSold();
        if (contract instanceof LeaseContract lease) {

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("contracts.csv",true))) {
                // Write lease information
                /*
                EXPECTED_ENDING_VALUE|LEASE_FEE|TOTAL_PRICE|MONTHLY_PAYMENT
                 */
                bw.write("LEASE"+"|"+contract.getDate()+"|"+contract.getName()+"|"+contract.getEmail()+"|"+vehicle.getVin()+"|"+vehicle.getYear()+"|"+vehicle.getMake()+"|"+vehicle.getModel()+
                        "|"+vehicle.getVehicleType()+"|"+vehicle.getColor()+"|"+vehicle.getOdometer()+"|"+vehicle.getPrice()+"|"+lease.getEndingExpectedValue() + "|" + lease.getLeaseFee() + "|" + lease.getTotalPrice()+"|"+ lease.getMonthlyPayment());
                bw.newLine();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        else if(contract instanceof SalesContract sale){
            /*
            SALES_TAX|RECORDING_FEE|PROCESSING_FEE|TOTAL_PRICE|FINANCE_OPTION
|MONTHLY_PAYMENT
             */
            String financeOption = sale.isFinance() ? "YES" : "NO";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("contracts.csv",true))) {
                // Write lease information
                /*
                E|DATE|CUSTOMER_NAME|CUSTOMER_EMAIL|VIN|YEAR|MAKE|MOD
EL|VEHICLE_TYPE|COLOR|ODOMETER|VEHICLE_PRICE
                 */
                bw.write("SALE" +"|"+contract.getDate()+"|"+contract.getName()+"|"+contract.getEmail()+"|"+vehicle.getVin()+"|"+vehicle.getYear()+"|"+vehicle.getMake()+"|"+vehicle.getModel()+"|"+vehicle.getVehicleType()+"|"+vehicle.getColor()+"|"+vehicle.getOdometer()+"|"+vehicle.getPrice()+"|"+sale.getSalesTaxAmount() + "|" + sale.getRecordingFee()+
                        "|" + sale.getProcessingFee()+"|"+ sale.getTotalPrice()+"|"+financeOption+"|"+ sale.getMonthlyPayment());
                bw.newLine();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
