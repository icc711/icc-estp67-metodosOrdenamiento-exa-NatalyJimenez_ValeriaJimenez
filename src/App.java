import models.Brand;
import models.CarModel;
import models.CarYear;

public class App {
        public static void main(String[] args) throws Exception {
                System.out.println("Examen interciclo de Estructuras de Datos");               

                Brand[] brands = createBrands();               
                Brand brandObj = new Brand("", new CarModel[] {});                
                
                // se imprimer lista original
                System.out.println("\nOriginal:");
                for (Brand b : brands){
                        System.out.println(b.getBrandName() + " - Años Válidos: " + b.getTotalValidYears());
                }

                //Ordenar por metodo "SelectionSort Descendente"
                brands = brandObj.sortSelectionDesc(brands);
                System.out.println("\nOrdenado por Selection Sort descendente:");
                for(Brand b: brands){
                        System.out.println(b.getBrandName() + " - Años válidos: " + b.getTotalValidYears());
                }

                //Buscar con 4 años válidos
                System.out.println("\nBuscar marca con 4 años válidos que se ordenaron de mayor a menor: ");
                Brand r1 = brandObj.binarySearchByValidYears(brands, 4, false);
                if (r1 != null) {
                        System.out.println("Encontrada: Marca: " + r1.getBrandName() + ", Total años válidos: " + r1.getTotalValidYears());
                } else {
                        System.out.println("No encontrada. ");
                }

                System.out.println("\nBuscar marca con 3 años válidos que se encontraron de mayor a menor:");
                Brand r2 = brandObj.binarySearchByValidYears(brands, 3, false);
                if (r2 != null) {
                        System.out.println("Encontrada: Marca: " + r2.getBrandName() + ", Total años válidos:" + r2.getTotalValidYears());
                }else{
                        System.out.println("No encontrada");
                }
        }

        /**
         * Crea un arreglo de marcas de ejemplo para pruebas
         * 
         * @return Arreglo de marcas con modelos y años
         */
        public static Brand[] createBrands() {
      
                // ===== HONDA =====
                CarYear[] civicYears = {
                                new CarYear(2018, false),
                                new CarYear(2019, true),
                                new CarYear(2020, false),
                                new CarYear(2021, false),
                                new CarYear(2022, true),
                                new CarYear(2023, false)
                };

                CarYear[] accordYears = {
                                new CarYear(2017, true),
                                new CarYear(2018, false),
                                new CarYear(2019, true),
                                new CarYear(2020, true),
                                new CarYear(2021, false),
                                new CarYear(2022, true)
                };

                CarModel[] hondaModels = {
                                new CarModel("Civic", civicYears),
                                new CarModel("Accord", accordYears)
                };

                Brand honda = new Brand("Honda", hondaModels);

                // ===== TOYOTA =====
                CarYear[] corollaYears = {
                                new CarYear(2017, true),
                                new CarYear(2018, true),
                                new CarYear(2019, false),
                                new CarYear(2020, true),
                                new CarYear(2021, true),
                                new CarYear(2022, true),
                                new CarYear(2023, true)
                };

                CarYear[] camryYears = {
                                new CarYear(2018, true),
                                new CarYear(2019, true),
                                new CarYear(2020, true),
                                new CarYear(2021, false),
                                new CarYear(2022, false),
                                new CarYear(2023, true)
                };

                CarModel[] toyotaModels = {
                                new CarModel("Corolla", corollaYears),
                                new CarModel("Camry", camryYears)
                };

                Brand toyota = new Brand("Toyota", toyotaModels);

                // ===== FORD =====
                CarYear[] mustangYears = {
                                new CarYear(2016, true),
                                new CarYear(2017, false),
                                new CarYear(2018, true),
                                new CarYear(2019, false),
                                new CarYear(2020, false),
                                new CarYear(2021, false),
                                new CarYear(2022, false)
                };

                CarYear[] f150Years = {
                                new CarYear(2017, false),
                                new CarYear(2018, true),
                                new CarYear(2019, false),
                                new CarYear(2020, true),
                                new CarYear(2021, true),
                                new CarYear(2022, false)
                };

                CarModel[] fordModels = {
                                new CarModel("Mustang", mustangYears),
                                new CarModel("F-150", f150Years)
                };

                Brand ford = new Brand("Ford", fordModels);

                // ===== CHEVROLET =====
                CarYear[] silveradoYears = {
                                new CarYear(2016, false),
                                new CarYear(2017, true),
                                new CarYear(2018, true),
                                new CarYear(2019, false),
                                new CarYear(2020, true),
                                new CarYear(2021, false),
                                new CarYear(2022, true)
                };

                CarYear[] camaroYears = {
                                new CarYear(2017, true),
                                new CarYear(2018, false),
                                new CarYear(2019, true),
                                new CarYear(2020, false),
                                new CarYear(2021, true),
                                new CarYear(2022, true)
                };

                CarModel[] chevroletModels = {
                                new CarModel("Silverado", silveradoYears),
                                new CarModel("Camaro", camaroYears)
                };

                Brand chevrolet = new Brand("Chevrolet", chevroletModels);

                // ===== NISSAN =====
                CarYear[] altimaYears = {
                                new CarYear(2016, true),
                                new CarYear(2017, false),
                                new CarYear(2018, false),
                                new CarYear(2019, true),
                                new CarYear(2020, true),
                                new CarYear(2021, false),
                                new CarYear(2022, true)
                };

                CarYear[] sentraYears = {
                                new CarYear(2017, false),
                                new CarYear(2018, true),
                                new CarYear(2019, true),
                                new CarYear(2020, false),
                                new CarYear(2021, true),
                                new CarYear(2022, false)
                };

                CarModel[] nissanModels = {
                                new CarModel("Altima", altimaYears),
                                new CarModel("Sentra", sentraYears)
                };

                Brand nissan = new Brand("Nissan", nissanModels);

                // ===== MAZDA =====
                CarYear[] mazda3Years = {
                                new CarYear(2016, true),
                                new CarYear(2017, true),
                                new CarYear(2018, true),
                                new CarYear(2019, true),
                                new CarYear(2020, true),
                                new CarYear(2021, true),
                                new CarYear(2022, true)
                };

                CarYear[] cx5Years = {
                                new CarYear(2017, true),
                                new CarYear(2018, true),
                                new CarYear(2019, true),
                                new CarYear(2020, false),
                                new CarYear(2021, true),
                                new CarYear(2022, true)
                };

                CarModel[] mazdaModels = {
                                new CarModel("Mazda3", mazda3Years),
                                new CarModel("CX-5", cx5Years)
                };

                Brand mazda = new Brand("Mazda", mazdaModels);

                // ===== HYUNDAI =====
                CarYear[] elantraYears = {
                                new CarYear(2016, true),
                                new CarYear(2017, true),
                                new CarYear(2018, false),
                                new CarYear(2019, true),
                                new CarYear(2020, false),
                                new CarYear(2021, false),
                                new CarYear(2022, true)
                };

                CarYear[] tucsonYears = {
                                new CarYear(2017, false),
                                new CarYear(2018, true),
                                new CarYear(2019, true),
                                new CarYear(2020, true),
                                new CarYear(2021, false),
                                new CarYear(2022, true)
                };

                CarModel[] hyundaiModels = {
                                new CarModel("Elantra", elantraYears),
                                new CarModel("Tucson", tucsonYears)
                };

                Brand hyundai = new Brand("Hyundai", hyundaiModels);

                return new Brand[] { honda, toyota, ford, chevrolet, nissan, mazda, hyundai };
        }

}
