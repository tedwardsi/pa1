#!/bin/bash
rm -f output 2>&1 >/dev/null
javac *.java
rc=$?
total=0
if [[ $rc == 0 ]]; then
    java MediaManager > output
    diff -iBw output.reference output
    rc=$?
    if [[ $rc == 0 ]]; then
      echo "All tests passed"
    else
      echo "One or more tests failed"
    fi
  exit $rc
fi