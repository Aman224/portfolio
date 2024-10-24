import { useEffect, useState } from "react";

const MainPage = () => {
  const [data, setData] = useState(null);

  useEffect(() => {
    fetch("http://localhost:8080")
      .then((response) => response.json())
      .then((json) => {
        setData(json);
        console.log(json);
      })
      .catch((error) => console.log(error));
  }, []);

  return (
    <div>
      {data ? <pre>{JSON.stringify(data, null, 2)}</pre> : "Loading Data"}
    </div>
  );
};

export default MainPage;
