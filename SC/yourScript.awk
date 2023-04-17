#!/usr/bin/awk -f

BEGIN {
    FS=","
    min_leaves=9999
}

{
    if($3 < min_leaves) {
        min_leaves=$3
        employee_names=$2
    } else if($3 == min_leaves) {
        employee_names=employee_names"\n"$2
    }
}

END {
    print employee_names
}
