#!/usr/bin/env bash
read -d '' QUERY <<"EOF"
  {
    "operation":"read-resource",
    "address":[
      "host", "master",
      "server", "server-one",
      "deployment", "sample-connector-clientEAR.ear",
      "subdeployment", "*",
      "subsystem", "resource-adapters",
      "statistics", "statistics"
    ],
    "recursive-depth": 10,
    "include-runtime": true,
    "json.pretty": 1
  }
EOF

curl --digest -L http://admin:admin@localhost:9990/management --header "Content-Type: application/json" -d "$QUERY"
