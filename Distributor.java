public class Distributor {
    public static double totalDistributorBilling(double sp,double rj, double mg, double es, double outros){
        return sp + rj + mg + es + outros;
    }

    public static void percentagePerUF(double sp,double rj, double mg, double es, double outros){
        double total = totalDistributorBilling(sp,rj,mg,es,outros);
        double percentageSp = (sp / total) * 100;
        double percentageRj = (rj / total) * 100;
        double percentageMg = (mg / total) * 100;
        double percentageEs = (es / total) * 100;
        double percentageOutros = (outros / total) * 100;
        System.out.printf("SP: %.2f%%%n",percentageSp);
        System.out.printf("RJ: %.2f%%%n",percentageRj);
        System.out.printf("MG: %.2f%%%n",percentageMg);
        System.out.printf("ES: %.2f%%%n",percentageEs);
        System.out.printf("OUTROS: %.2f%%%n",percentageOutros);
    }
    public static void main (String[] args){
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        percentagePerUF(sp,rj,mg,es,outros);
    }
}
