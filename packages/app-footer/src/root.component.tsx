import { HelloHeader } from "@luisenmarroquin/app-header-project";

export default function Root(props: { name: string }) {
  return (
    <section style={{ textAlign: "center" }}>
      {props.name} is mounted!
      <HelloHeader />
    </section>
  );
}

export function HelloFooter() {
  return <div>HelloFromFooter</div>;
}
