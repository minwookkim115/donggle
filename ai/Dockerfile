# Start from the official Python base image.
FROM python:3.9

# Set the current working directory to /code.
WORKDIR /code

# Copy the file with the requirements to the /code directory.
COPY ./requirements.txt /code/requirements.txt

# Install the package dependencies in the requirements file.
RUN pip install --no-cache-dir --upgrade -r /code/requirements.txt
RUN pip install --no-cache-dir boto3

# Copy the ./app directory inside the /code directory.
COPY ./app /code/app
# COPY ./class_names.txt /code/class_names.txt

RUN apt-get update
RUN apt-get -y install libgl1-mesa-glx
# Set the command to run the uvicorn server.
CMD ["uvicorn", "app.main:app", "--host", "0.0.0.0", "--port", "3000"]

