#include <stdio.h>
#include <stdlib.h>

#define CRITICAL_THRESHOLD 23.0
#define SAFE_MAX 50.0 

float celsius_to_fahrenheit(float celsius) {
    return (celsius * 9 / 5) + 32;
}

int main() {
    FILE *file;
    char filename[] = "temp.txt";
    float temperature_c, temperature_f;

    file = fopen(filename, "r");
    if (file == NULL) {
        printf("Error: Could not open file %s\n", filename);
        return 1;
    }

    printf("| %-10s | %-10s | %-10s |\n", "Temp (C)", "Temp (F)", "Status");
    printf("----------------------------------------------\n");

    while (1) {
        int result = fscanf(file, "%f", &temperature_c);
        if (result != 1) {
            break;
        }

        temperature_f = celsius_to_fahrenheit(temperature_c);

        char status[20];
        if (temperature_f < CRITICAL_THRESHOLD) {
            snprintf(status, sizeof(status), "Below");
        } else if (temperature_f > SAFE_MAX) {
            snprintf(status, sizeof(status), "Above");
        } else {
            snprintf(status, sizeof(status), "Right");
        }

        printf("| %-10.2f | %-10.2f | %-10s |\n", temperature_c, temperature_f, status);
    }

    fclose(file);
    return 0;
}
