#!/bin/bash

read value

if [[ "$value" =~ ^[0-9]+$ ]]; then
    echo "PNUM"
elif [[ "$value" =~ ^-[0-9]+$ ]]; then
    echo "NNUM"
else
    echo "STRING"
fi
