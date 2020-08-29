# CucumberCookiecutter
## Overview
This is a [cookiecutter](https://cookiecutter.readthedocs.io/en/latest/README.html) project which generates a java maven project with Cucumber setup

## How to create a project
### Prerequisites
1. Install [cookiecutter](https://cookiecutter.readthedocs.io/en/latest/installation.html)
2. Install [Java](https://java.com/en/download/help/download_options.xml)
3. Install [maven](https://maven.apache.org/install.html)

### Create
This is how to create a new project based on this cookiecutter project:

```cookiecutter /path/to/this/local/cookiecutter/project```

When the command above is executed you will be prompted to enter some more details about the project and its features. You can press Enter to keep the default values.

Example:
If you have cloned this project to ```/home/username/CucumberCookiecutter```
then you should run the following command:

```cookiecutter /home/username/CucumberCookiecutter```

### Test
In order to test if the project was created successfully, run the following command from the root of the newly created project:
1. If for ```project_name``` you have chosen a name ending with ```*Test.java```:

```mvn clean test```

2. If for ```project_name``` you have chosen a random name: 

```mvn -Dtest=<the chosen project_name> test```