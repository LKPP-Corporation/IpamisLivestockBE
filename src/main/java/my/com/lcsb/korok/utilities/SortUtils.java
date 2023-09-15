package my.com.lcsb.korok.utilities;

import org.springframework.data.domain.Sort;

public class SortUtils {
    public static Sort.Order getSortOrder(String sort) {
        if (sort == null || sort.isEmpty()) {
            return null;
        }

        String[] sortPair = sort.split(",");
        if (sortPair.length == 2) {
            String field = sortPair[0];
            String direction = sortPair[1];

            if (direction.equalsIgnoreCase("asc")) {
                return Sort.Order.asc(field);
            } else if (direction.equalsIgnoreCase("desc")) {
                return Sort.Order.desc(field);
            }
        }

        return null;
    }
}
