#include <stdio.h>
#include <string.h>

#define USERNAME "admin"
#define PASSWORD "password123"

int main() {
    char enteredUsername[50];
    char enteredPassword[50];

    printf("Enter username: ");
    fgets(enteredUsername, sizeof(enteredUsername), stdin);
    // Remove newline character if present
    enteredUsername[strcspn(enteredUsername, "\n")] = '\0';

    printf("Enter password: ");
    fgets(enteredPassword, sizeof(enteredPassword), stdin);
    // Remove newline character if present
    enteredPassword[strcspn(enteredPassword, "\n")] = '\0';

    // Check credentials
    if (strcmp(enteredUsername, USERNAME) == 0 && strcmp(enteredPassword, PASSWORD) == 0) {
        printf("Login successful!\n");
    } else {
        printf("Login failed. Invalid username or password.\n");
    }

    return 0;
}
