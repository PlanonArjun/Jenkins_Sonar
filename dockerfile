version: '3'
services:
  chromgrid:
    image: selenium/standalone-chrome:latest
    container_name: chromgrid
    ports:
      - "4445:4444"
      shm_size: "2g"

  edgegrid:
    image: selenium/standalone-edge:latest
    container_name: edgegrid
    ports:
      - "4447:4444"
      - "7903:7900"
    shm_size: "2g"