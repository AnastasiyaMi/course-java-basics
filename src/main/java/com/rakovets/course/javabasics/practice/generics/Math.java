package com.rakovets.course.javabasics.util;

import java.util.Arrays;

public class Math {
   public static <T extends Comparable<T>> T max(T params1, T params2, T params3) {
        if (params1.compareTo(params2) >= 0) {
            if (params1.compareTo(params3) >= 0) {
                if (params1.compareTo(params3) >= 0) {
                    return params1;
                }
            }
        }
        if (params2.compareTo(params1) >= 0) {
            if (params2.compareTo(params3) >= 0) {
                return params2;
            }
        }
        if (params3.compareTo(params1) >= 0) {
            if (params3.compareTo(params2) >=0) {
                return params3;
            }
        }
        return null;
    }

    public static <T extends Comparable <T>> T min(T params1, T params2, T params3, T params4, T params5) {
        if (params1.compareTo(params2) <= 0) {
            if (params1.compareTo(params3) <= 0) {
                if (params1.compareTo(params4) <= 0) {
                    if (params1.compareTo(params5) <= 0) {
                        return params1;
                    }
                }
            }
        }
        if (params2.compareTo(params1) <= 0) {
            if (params2.compareTo(params3) <= 0) {
                if (params2.compareTo(params4) <=0) {
                    if (params2.compareTo(params5) <= 0) {
                        return params2;
                    }
                }
            }
        }
        if (params3.compareTo(params1) <= 0) {
            if (params3.compareTo(params2) <=0) {
                if (params3.compareTo(params4) <=0) {
                    if (params3.compareTo(params5) <=0) {
                        return params3;
                    }
                }
            }
        }
        if (params4.compareTo(params1) <= 0) {
            if (params4.compareTo(params2) <=0) {
                if (params4.compareTo(params3) <=0) {
                    if (params4.compareTo(params5) <=0) {
                        return params4;
                    }
                }
            }
       }
        if (params5.compareTo(params1) <= 0) {
            if (params5.compareTo(params2) <=0) {
                if (params5.compareTo(params3) <=0) {
                   if (params5.compareTo(params4) <=0) {
                        return params5;
                    }
                }
           }
        }
        return null;
    }

    public static <T extends Comparable> T arrayMax(T[] array) {
        T max = array[0];
        for (T type : array) {
            if (type.compareTo(max) > 0) {
                max = type;
            }
        }
        return max;
    }

    public static <T extends Comparable> T arrayMin (T[] array) {
        T min = array[0];
        for (T type : array) {
            if (type.compareTo(min) < 0) {
                min = type;
            }
        }
        return min;
    }

    public static <T extends Comparable> T[] arraySort (T[] array) {
        Arrays.sort(array);
        return array;
    }

}
