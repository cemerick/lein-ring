(ns leiningen.ring.server-headless
  (:use leiningen.ring.server))

(defn server-headless
  "Start a Ring server without opening a browser."
  ([project]
     (server-task project {:headless? true}))
  ([project port]
     (server-task project {:port (Integer. port), :headless? true})))
