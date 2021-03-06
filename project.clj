(defproject slacker/slacker-cluster "0.11.0"
  :description "Cluster support for slacker"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/sunng87/slacker-cluster"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [slacker "0.11.0"]
                 [zookeeper-clj "0.9.3"
                  :exclusions [jline junit]]
                 [org.clojure/tools.logging "0.2.6"]]
  :profiles {:example {:source-paths ["examples"]}
             :1.3 {:dependencies [org.clojure/clojure "1.3.0"]}}
  :plugins [[codox "0.6.7"]]
  :global-vars {*warn-on-reflection* true}
  :aliases {"run-example-server" ["with-profile" "default,example" "run" "-m" "slacker.example.cluster-server"]
            "run-example-client" ["with-profile" "default,example" "run" "-m" "slacker.example.cluster-client"]})
