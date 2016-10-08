(ns confluency.core
  (:require [clj-http.client :as http]))

(def host "https://confluency.atlassian.net")
(defn cget [& args]
  (http/get (str host "/wiki/rest/api/" (apply str args))
            {:as :json}))
(defn page
  [id]
  (:body (cget "content/" id)))

(defn children
  [id]
  (:body (cget "content/" id "/child/page")))


;(page host 1081356)
;(children host 1081358)
(map :id (:results (children 1081358)))

