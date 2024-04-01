# CityLookup Project

The CityLookup project is a Java application that allows users to manage and analyze city data. It includes two main classes: `CityStats` and `CityLookup`. The `CityStats` class is made `Comparable`, enabling the sorting of cities based on the cost of living index. This sorting functionality facilitates the identification of cities by rank and the display of lists of the least and most expensive cities.

## Features

- **CityStats Class**: Represents city statistics, including attributes such as name, population, cost of living index, etc.
- **CityLookup Class**: Manages a list of `CityStats` objects and provides functionality for sorting and displaying cities based on their cost of living index.

## Functionality

- **Sorting**: The `CityStats` class implements the `Comparable` interface, allowing the `CityLookup` class to sort cities based on their cost of living index.
- **Identification by Rank**: After sorting, users can identify cities by their rank, with the least expensive city at the front and the most expensive city at the end of the sorted list.
- **Display of Lists**: The application enables users to display lists of the least and most expensive cities, providing valuable insights into city affordability.

## Getting Started

To use the CityLookup project, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment (e.g., IntelliJ IDEA, Eclipse).
3. Compile and run the `CityLookup` class to start the application.
4. Use the provided functionality to manage and analyze city data as needed.


