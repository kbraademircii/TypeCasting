public class SalaryCalculator {

    public static void main(String[] args) {
        double employeeSalary = 85500.35;
        float bonusRate = 0.15f;
        double taxRate = 0.10; // %10 tax rate
        
        // Gross bonus calculation
        double grossBonus = employeeSalary * bonusRate;
        
        // Tax deduction (Proportional calculation)
        double netSensitiveBonus = grossBonus * (1 - taxRate); 
        
        // NARROWING CASTING 
        // During the conversion from double to int, the fractional part is discarded.
        int netBonusToBePaid = (int) netSensitiveBonus;
        
        System.out.println("Çalışan Maaşı: " + employeeSalary);
        System.out.println("Brüt Bonus: " + grossBonus);
        System.out.println("Vergi Sonrası Küsüratlı Bonus: " + netSensitiveBonus);
        System.out.println("Şirket Politikası Gereği Ödenecek Net (int) Bonus: " + netBonusToBePaid);
    }
}