package models;

import java.util.Arrays;

public class Brand {
  private String BrandName;
  private CarModel[] models;

  public int getTotalValidYears() {
    int total = 0;
    for (int i = 0; i < models.length; i++) {
      CarYear[] years = models[i].getYears();
      for (int j = i + 1; j < years.length; j++) {
        if (years[j].isValid()) {
          total++;
        }
      }
    }
    return total;
  }

  // ORDENAMIENTO:
  public Brand[] sortSelectionDesc(Brand[] brands) {
    for (int i = 0; i < brands.length - 1; i++) {
      int maxIndex = i;
      for (int j = i + 1; j < brands.length; j++) {
        if (brands[j].getTotalValidYears() > brands[maxIndex].getTotalValidYears()) {
          maxIndex = j;

        }
      }
      Brand aux = brands[maxIndex];
      brands[maxIndex] = brands[i];
      brands[i] = aux;
    }
    return brands;
  }

  public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
    int left = 0;
    int right = brands.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      int midYears = brands[mid].getTotalValidYears();
      if (midYears == validYears) {
        return brands[mid];

      }
      if (isAscending) {
        if (validYears > midYears) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      } else {
        if (validYears < midYears) {
          left = mid - 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return null;
  }

  public Brand(String brandName, CarModel[] models) {
    BrandName = brandName;
    this.models = models;
  }

  public String getBrandName() {
    return BrandName;
  }

  public void setBrandName(String brandName) {
    BrandName = brandName;
  }

  public CarModel[] getModels() {
    return models;
  }

  public void setModels(CarModel[] models) {
    this.models = models;
  }

  @Override
  public String toString() {
    return "Brand [BrandName=" + BrandName + ", models=" + Arrays.toString(models) + "]";
  }

}
