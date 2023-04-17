
BEGIN {
    i = ARGV[1]
    file = "shopping_bill_"i ".txt"
    if (ARGC < 2 || !system("[ ! -e "file" ]" )) {
        print "FILE NOT FOUND"
        exit
    }
}

/^[Cc]ustomer [Nn]ame/ {
    split($0, parts, ":")
    customer = parts[2]
}

/^[Ss]hop [Nn]ame/ {
    split($0, parts, ":")
    shop = parts[2]
}

/^[Nn]umber [Oo]f [Ii]tems [Pp]urchased/ {
    split($0, parts, ":")
    num_items = parts[2]
}

/^[Tt]otal [Bb]ill/ {
    split($0, parts, ":")
    total_bill = parts[2]
}

END {
    print "CUSTOMER NAME : " customer
    print "SHOP NAME : " shop
    print "NUMBER OF ITEMS PURCHASED : " num_items
    print "TOTAL BILL : " total_bill
}