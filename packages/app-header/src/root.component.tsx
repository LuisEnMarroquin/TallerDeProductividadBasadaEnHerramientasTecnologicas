import { HelloFooter } from "@luisenmarroquin/app-footer-project";

export default function Root(props: { name: string }) {
  return (
    <section style={{ textAlign: "center" }}>
      {props.name} is mounted!
      <HelloFooter />
    </section>
  );
}

export function HelloHeader() {
  return <div>HelloFromHeader</div>;
}
