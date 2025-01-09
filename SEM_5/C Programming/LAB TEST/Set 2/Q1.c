#include <stdio.h>

int main() {
    int prev_reading, curr_reading, total_units;
    float cost_slab1 = 0, cost_slab2 = 0, cost_slab3 = 0, total_cost = 0, surcharge = 0;
    const float maintenance_charge = 50.0;

    printf("Enter the previous meter reading: ");
    scanf("%d", &prev_reading);
    printf("Enter the current meter reading: ");
    scanf("%d", &curr_reading);

    total_units = curr_reading - prev_reading;

    if (total_units <= 100) {
        cost_slab1 = total_units * 3.0;
    } else if (total_units <= 300) {
        cost_slab1 = 100 * 3.0;
        cost_slab2 = (total_units - 100) * 5.0;
    } else {
        cost_slab1 = 100 * 3.0;
        cost_slab2 = 200 * 5.0;
        cost_slab3 = (total_units - 300) * 7.0;
    }

    total_cost = cost_slab1 + cost_slab2 + cost_slab3 + maintenance_charge;

    if (total_cost > 1000) {
        surcharge = total_cost * 0.10;
    }

    total_cost += surcharge;

    printf("\nElectricity Bill Summary\n");
    printf("---------------------------------------------\n");
    printf("Slab           | Rate       | Consumed | Cost\n");
    printf("---------------------------------------------\n");
    printf("1 (<100)       | @3.00      | %8d | %8.2f\n", (total_units > 100 ? 100 : total_units), cost_slab1);
    printf("2 (101-300)    | @5.00      | %8d | %8.2f\n", (total_units > 300 ? 200 : (total_units > 100 ? total_units - 100 : 0)), cost_slab2);
    printf("3 (>300)       | @7.00      | %8d | %8.2f\n", (total_units > 300 ? total_units - 300 : 0), cost_slab3);
    printf("Maintenance    | Fixed      |         1 | %8.2f\n", maintenance_charge);
    if (surcharge > 0) {
        printf("Surcharge @10%% |            |           | %8.2f\n", surcharge);
    }
    printf("---------------------------------------------\n");
    printf("Total Bill     |            |           | %8.2f\n", total_cost);
    printf("---------------------------------------------\n");

    return 0;
}

