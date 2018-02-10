(defproject one.scorp/clj-ns-browser "1.3.2"
  :description "Smalltalk-like namespace/class/var/function browser for Clojure."
  :url "https://github.com/franks42/clj-ns-browser"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [seesaw "1.4.5"]
                 [com.miglayout/miglayout-swing "4.2"]
                 [org.clojure/tools.namespace "0.2.10"]
                 [org.clojure/tools.trace "0.7.9"]
                 [clojure-complete "0.2.5" :exclusions [org.clojure/clojure]]
                 [org.thnetos/cd-client "0.3.6"]
                 [hiccup "1.0.5"]
                 [clj-info "0.3.1"]]

   :dev-dependencies [[lein-marginalia "0.7.1"]
                      ;[franks42/debug-repl "0.3.1-FS"]
                      [codox "0.6.4"]]
  :jvm-opts ~(if (= (System/getProperty "os.name") "Mac OS X") ["-Xdock:name=Clj-NS-Browser"] [])
  :java-source-paths ["src-java"]
  ;; Use this for Leiningen version 2
  :resource-paths ["resource"])
  ;:main clj-ns-browser.core

