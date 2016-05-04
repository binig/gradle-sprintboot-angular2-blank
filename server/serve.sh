#!/bin/sh
export $(cat .env | xargs)  && java -jar build/libs/$1